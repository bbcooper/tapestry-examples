$(document).ready(
	function()
	{
		// Toggle Single Portlet
		$('a.toggle').click(function()
			{
				$(this).parent('div').next('div').toggle();
				return false;
			}
		);
		
		// Close Single Portlet
		$('a.closeAction').click(function()
			{
				$(this).parent('div').parent('div').hide();
				// should ask 'Are you sure?'
				return false;
			}
		);
		
		// Edit mode
		$("div.portlet_edit").hide();
		$("a.editModeCloseAction").hide();
		
		$('a.editModeAction').click(function()
			{
				$(this).parent('div').next('div').hide();
				$("div.portlet_edit").show();
				$('a.editModeAction').hide();
				$("a.editModeCloseAction").show();
				return false;
			}
		);
		
		$('a.editModeCloseAction').click(function()
			{
				$(this).parent('div').next('div').show();
				$("div.portlet_edit").hide();
				$('a.editModeAction').show();
				$("a.editModeCloseAction").hide();
				return false;
			}
		); // Edit mode

		// Invert All Portlets
		$('a#all_invert').click(function()
			{
				$('div.portlet_content').toggle();
				return false;
			}
		);

		// Expand All Portlets
		$('a#all_expand').click(function()
			{
				$('div.portlet_content:hidden').show();
				return false;
			}
		);

		// Collapse All Portlets
		$('a#all_collapse').click(function()
			{
				$('div.portlet_content:visible').hide();
				return false;
			}
		);

		// Open All Portlets
		$('a#all_open').click(function()
			{
				$('div.portlet:hidden').show();
				$('a#all_open:visible').hide();
				$('a#all_close:hidden').show();
				return false;
			}
		);

		// Close All Portlets
		$('a#all_close').click(function()
			{
				$('div.portlet:visible').hide();
				$('a#all_close:visible').hide();
				$('a#all_open:hidden').show();
				return false;
			}
		);

		// Controls Drag + Drop
		$('#columns td').Sortable(
			{
				accept: 'portlet',
				helperclass: 'sort_placeholder',
				opacity: 0.7,
				tolerance: 'intersect'
			}
		);
	}
);